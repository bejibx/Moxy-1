package moxy.presenter;

import moxy.MvpPresenter;

public abstract class PresenterField<PresentersContainer> {

    protected final String tag;

    protected final String presenterId;

    protected final Class<? extends MvpPresenter> presenterClass;

    protected PresenterField(String tag, String presenterId, Class<? extends MvpPresenter> presenterClass) {
        this.tag = tag;
        this.presenterId = presenterId;
        this.presenterClass = presenterClass;
    }

    public abstract void bind(PresentersContainer container, MvpPresenter presenter);

    // Delegated may be used from generated code if user plane to generate tag at runtime
    public String getTag(PresentersContainer delegated) {
        return tag;
    }

    public String getPresenterId() {
        return presenterId;
    }

    public Class<? extends MvpPresenter> getPresenterClass() {
        return presenterClass;
    }

    public abstract MvpPresenter<?> providePresenter(PresentersContainer delegated);
}
