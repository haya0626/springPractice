package practice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 住所候補1件分のデータを保持するクラス
 */
@Data
@AllArgsConstructor // 全フィールドに対する初期化値を引数にとるコンストラクタを生成
@NoArgsConstructor // デフォルトコンストラクタを自動生成
public class AddressSuggestionDto {
    // 住所コード
    private String code;

    // 表示する住所
    private String address;
}