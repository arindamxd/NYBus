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

package com.mindorks.nybus.AndroidScheduler;


import com.mindorks.nybus.scheduler.SchedulerProvider;

import java.util.concurrent.Executors;

import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Jyoti on 14/08/17.
 */

public class SchedulerProviderImplementation implements SchedulerProvider {

    @Override
    public Scheduler provideMainThreadScheduler() {
        return Schedulers.io();
    }

    @Override
    public Scheduler provideIOScheduler() {
        return Schedulers.io();
    }

    @Override
    public Scheduler provideComputationScheduler() {
        return Schedulers.computation();
    }

    @Override
    public Scheduler provideTrampolineScheduler() {
        return Schedulers.trampoline();
    }

    @Override
    public Scheduler provideExecutorScheduler() {
        return Schedulers.from(Executors.newCachedThreadPool());
    }

    @Override
    public Scheduler provideNewThreadScheduler() {
        return Schedulers.newThread();
    }

}
