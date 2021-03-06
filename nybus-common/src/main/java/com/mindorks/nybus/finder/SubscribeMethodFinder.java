/*
 *    Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.mindorks.nybus.finder;

import java.util.List;

/**
 * Created by amitshekhar on 31/08/17.
 */

/**
 * Interface for finding the subscribed methods on the list of channel ids for the given target.
 */
public interface SubscribeMethodFinder {

    /**
     * Get all the subscribed methods.
     *
     * @param object    the target object.
     * @param channelId the list of channel ids.
     * @return the {@link TargetData} which holds all the subscribed methods.
     */
    TargetData getData(Object object, List<String> channelId);

}
