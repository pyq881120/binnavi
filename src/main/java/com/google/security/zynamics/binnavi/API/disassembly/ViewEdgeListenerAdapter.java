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
package com.google.security.zynamics.binnavi.API.disassembly;

import java.awt.Color;

// / Adapter class for view edges
/**
 * Adapter class that can be used by objects that want to listen on view edges but only need to
 * process few events.
 */
public class ViewEdgeListenerAdapter implements IViewEdgeListener {
  @Override
  public void changedColor(final ViewEdge edge, final Color color) {
    // Empty default implementation
  }

  @Override
  public void changedVisibility(final ViewEdge edge, final boolean visibility) {
    // Empty default implementation
  }
}
