package practice.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Lombokアノテーション
 * 
 * @Data : getter,setter,toStringなど自動生成
 * @AllArgsConstructor : 引数なしでコンストラクタ作成
 * @NoArgsConstructor : すべてのフィールドを引数に持つコンストラクタ
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InputForm {
    private String name; // 名前

    private Integer age; // 年齢

    private String gender; // 性別

    private String address; // 住所

    private String income; // 年収
}
