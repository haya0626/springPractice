package practice.controller;

import java.util.concurrent.CompletableFuture;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import practice.dto.AddressSuggestionResponseDto;
import practice.service.AddressSuggestionService;

/**
 * 住所候補取得用のAPIコントローラ
 */
@RestController
@RequestMapping("/api/address")
public class AddressSuggestionController {

    // Serviceを使うために受け取る
    private final AddressSuggestionService addressSuggestionService;

    // Serviceの呼び出し（コンストラクタ）
    public AddressSuggestionController(AddressSuggestionService addressSuggestionService) {
        this.addressSuggestionService = addressSuggestionService;
    }

    /**
     * 住所候補取得API
     */
    @GetMapping("/suggest")
    public CompletableFuture<AddressSuggestionResponseDto> suggest(
            @RequestParam("keyword") String keyword) {

        return addressSuggestionService.suggestAddresses(keyword)
                // listで返されるため（型合わない）、dtoを指定する
                .thenApply(AddressSuggestionResponseDto::new);
    }
}