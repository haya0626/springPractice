package practice.service;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import practice.dto.AddressSuggestionDto;

/**
 * 住所候補を検索するServiceの定義
 */
public interface AddressSuggestionService {
    // CompletableFuture = 非同期用のクラス
    CompletableFuture<List<AddressSuggestionDto>> suggestAddresses(String keyword);
}