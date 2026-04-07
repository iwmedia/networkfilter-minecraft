package ls.ni.networkfilter.common.config.cache.types;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RedisSentineledCacheSettings {

    @NotNull
    private String master;

    private List<String> addresses;

    private String username;
    private String password;

    @NotNull
    @Positive
    private Long cacheTimeMinutes;

    @NotNull
    private boolean ssl;
}
