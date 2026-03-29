package practice.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor 
@NoArgsConstructor 
public class InputForm {
    private String name; // 名前
	
	private Integer age;	// 年齢
	
	private String gender; // 性別

    private String address; // 住所

    private Integer income;	// 年収
}
