package practice.config;

import java.util.concurrent.Executor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * 非同期処理を使うための設定クラス
 */
@Configuration
@EnableAsync // @Async を使えるようにする

public class AsyncGetAddress {
    /**
     * 非同期処理で使う実行処理をSpringに登録する
     */
    @Bean("taskExecutor")
    public Executor taskExecutor() {
        // 並行実行を行うためのスレッドプール管理クラス
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        // 初期化して使える状態にする
        executor.initialize();
        return executor;
    }
}