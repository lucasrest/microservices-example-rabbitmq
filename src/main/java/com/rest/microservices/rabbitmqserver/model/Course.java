package com.rest.microservices.rabbitmqserver.model;


import lombok.*;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Course implements Serializable {

    @NotNull(message = "The field 'title' is mandatory")
    private String title;

    private String fila;

}

