/*
 * Copyright 2017 The Mifos Initiative
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.mifos.template.service.internal.command;

import io.mifos.template.api.v1.domain.Sample;

public class SampleCommand {

  private final Sample sample;

  public SampleCommand(final Sample sample) {
    super();
    this.sample = sample;
  }

  public Sample sample() {
    return this.sample;
  }
}
