package com.maplr.testhockeygame.exception;

import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PlayerNotFoundException extends EntityNotFoundException {

  public PlayerNotFoundException(String message) {
    super(message);
  }
}
