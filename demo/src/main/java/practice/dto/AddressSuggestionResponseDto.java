package practice.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * APIで返す住所候補一覧を保持するクラス
 */
@Data
@AllArgsConstructor // 全フィールドに対する初期化値を引数にとるコンストラクタを生成
@NoArgsConstructor // デフォルトコンストラクタを自動生成
public class AddressSuggestionResponseDto {
    // 住所候補一覧
    private List<AddressSuggestionDto> suggestions;
}