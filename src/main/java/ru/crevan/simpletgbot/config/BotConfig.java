package ru.crevan.simpletgbot.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Data
@PropertySource("application.properties")
public class BotConfig {

    String token = System.getenv("Tg_api_key");

    @Value("${bot.name}")
    String botName;

}
