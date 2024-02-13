package com.evaluation.demo.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@Builder
public class ClientRequestDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1869299638508316639L;

    private long id;
    private Boolean active;

}
