package com.bilgeadam.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.io.Serializable;
import java.util.Date;

@Log4j2
@Data
@AllArgsConstructor
@NoArgsConstructor


public class CommonProperty implements Serializable {

    private int id;
    private Date date;


}
