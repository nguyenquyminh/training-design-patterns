/**
 * Copyright 2024 (c) All rights by Robert Bosch GmbH. We reserve all rights of disposal such as
 * copying and passing on to third parties.
 *
 * @author: PMA4HC
 * @since: 26/Jun/2024
 */

package com.example.command.newservice.command;

import com.example.command.domain.Light;

public class LightOffCommand implements Command{

  private final Light light;

  public LightOffCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.off();
  }
}
