/*
 * Copyright © 2014 Cask Data, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package co.cask.tigon.sql.manager;

import java.net.InetSocketAddress;

/**
 * Class to store HubDataSink Information.
 */
public class HubDataSink {
  private final String name;
  private final InetSocketAddress address;
  private final String ftaName;

  public HubDataSink(String name, String ftaName, InetSocketAddress address) {
    this.name = name;
    this.address = address;
    this.ftaName = ftaName;
  }

  public String getName() {
    return name;
  }

  public InetSocketAddress getAddress() {
    return address;
  }

  public String getFTAName() {
    return ftaName;
  }
}
