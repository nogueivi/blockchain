package com.blockchain.ucoin.resource;

import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class BlockMineRequest {
    @NotEmpty
    private String hash;
}
