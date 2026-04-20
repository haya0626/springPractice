package practice.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import practice.dto.AddressSuggestionDto;
import practice.service.AddressSuggestionService;

/**
 * 住所候補検索の実装クラス
 */
@Service
public class AddressSuggestionServiceImpl implements AddressSuggestionService {

    // ダミーの住所データ
    private static final List<AddressSuggestionDto> ADDRESS_MASTER = Arrays.asList(
            new AddressSuggestionDto("001", "東京都千代田区"),
            new AddressSuggestionDto("002", "東京都中央区"),
            new AddressSuggestionDto("003", "東京都港区"),
            new AddressSuggestionDto("004", "東京都新宿区"),
            new AddressSuggestionDto("005", "神奈川県横浜市"),
            new AddressSuggestionDto("006", "神奈川県川崎市"),
            new AddressSuggestionDto("007", "埼玉県さいたま市"),
            new AddressSuggestionDto("008", "千葉県千葉市"),
            new AddressSuggestionDto("009", "大阪府大阪市"),
            new AddressSuggestionDto("010", "京都府京都市"));

    @Override
    @Async("taskExecutor") // AsyncGetAddress.javaで登録したtaskExecutorを呼んで非同期実行
    public CompletableFuture<List<AddressSuggestionDto>> suggestAddresses(String keyword) {
        // 入力チェック
        if (keyword == null || keyword.isBlank()) {
            return CompletableFuture.completedFuture(List.of()); // 空のリストを返す
        }

        // 前後の空白を除去
        String trimmedKeyword = keyword.trim();

        // 住所一覧から、入力文字を含む住所だけを取り出す
        List<AddressSuggestionDto> result = ADDRESS_MASTER.stream()
                .filter(data -> data.getAddress().contains(trimmedKeyword))
                .collect(Collectors.toList()); // stream化したためlistに戻す

        return CompletableFuture.completedFuture(result);
    }
}