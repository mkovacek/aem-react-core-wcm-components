/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 ~ Copyright 2018 Adobe Systems Incorporated
 ~
 ~ Licensed under the Apache License, Version 2.0 (the "License");
 ~ you may not use this file except in compliance with the License.
 ~ You may obtain a copy of the License at
 ~
 ~     http://www.apache.org/licenses/LICENSE-2.0
 ~
 ~ Unless required by applicable law or agreed to in writing, software
 ~ distributed under the License is distributed on an "AS IS" BASIS,
 ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 ~ See the License for the specific language governing permissions and
 ~ limitations under the License.
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
package com.adobe.cq.wcm.core.examples.react.components.ssr;


import com.adobe.cq.wcm.core.examples.react.components.ssr.model.SSRResponse;

/**
 * SpaBindingsProvider
 * <p>
 * Holds thread local bindings so they are only initialized once to improve performance
 * </p>
 *
 */
public interface SpaPageBindingsProvider {
    
    /**
     * gives true if the result is successful, or if the result is unsuccessful AND fallback is NOT enabled.
     * @return
     */
    boolean isServerSideRenderingActiveForRequest();
    
    boolean isFallbackToClientSideRenderingActive();
    
    SSRResponse getServerSideRenderedRequestResult();
}
