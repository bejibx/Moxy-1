package view;

import moxy.MvpView;

public interface OverloadingView extends MvpView {
    void method(String string);

    void method(int number);

    void method(Object object);
}