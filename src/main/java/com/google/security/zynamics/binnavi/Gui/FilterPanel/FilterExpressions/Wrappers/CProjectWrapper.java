/*
Copyright 2015 Google Inc. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.google.security.zynamics.binnavi.Gui.FilterPanel.FilterExpressions.Wrappers;

import com.google.security.zynamics.binnavi.disassembly.INaviProject;

/**
 * Wraps a project object for filtering.
 */
public final class CProjectWrapper implements IFilterWrapper<INaviProject>, INamedElement {
  /**
   * The wrapped project object.
   */
  private final INaviProject m_project;

  /**
   * Creates a new wrapper object.
   * 
   * @param project The wrapped project object.
   */
  public CProjectWrapper(final INaviProject project) {
    m_project = project;
  }

  @Override
  public String getDescription() {
    return m_project.getConfiguration().getDescription();
  }

  @Override
  public String getName() {
    return m_project.getConfiguration().getName();
  }

  @Override
  public INaviProject unwrap() {
    return m_project;
  }
}
