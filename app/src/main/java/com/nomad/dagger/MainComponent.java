package com.nomad.dagger;

import dagger.Component;

@Component(modules = TextViewModule.class)
public interface MainComponent {

    void inject(MainActivity activity);
}
