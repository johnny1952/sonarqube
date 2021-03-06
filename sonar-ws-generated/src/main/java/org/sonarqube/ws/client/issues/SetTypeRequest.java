/*
 * SonarQube
 * Copyright (C) 2009-2017 SonarSource SA
 * mailto:info AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonarqube.ws.client.issues;

import java.util.List;
import javax.annotation.Generated;

/**
 * Change type of issue, for instance from 'code smell' to 'bug'.<br/>Requires the following permissions:<ul>  <li>'Authentication'</li>  <li>'Browse' rights on project of the specified issue</li>  <li>'Administer Issues' rights on project of the specified issue</li></ul>
 *
 * This is part of the internal API.
 * This is a POST request.
 * @see <a href="https://next.sonarqube.com/sonarqube/web_api/api/issues/set_type">Further information about this action online (including a response example)</a>
 * @since 5.5
 */
@Generated("https://github.com/SonarSource/sonar-ws-generator")
public class SetTypeRequest {

  private String issue;
  private String type;

  /**
   * Issue key
   *
   * This is a mandatory parameter.
   * Example value: "AU-Tpxb--iU5OvuD2FLy"
   */
  public SetTypeRequest setIssue(String issue) {
    this.issue = issue;
    return this;
  }

  public String getIssue() {
    return issue;
  }

  /**
   * New type
   *
   * This is a mandatory parameter.
   * Possible values:
   * <ul>
   *   <li>"CODE_SMELL"</li>
   *   <li>"BUG"</li>
   *   <li>"VULNERABILITY"</li>
   * </ul>
   */
  public SetTypeRequest setType(String type) {
    this.type = type;
    return this;
  }

  public String getType() {
    return type;
  }
}
