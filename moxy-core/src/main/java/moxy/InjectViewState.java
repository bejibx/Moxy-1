package moxy;

import java.lang.annotation.Target;
import moxy.viewstate.MvpViewState;

import static java.lang.annotation.ElementType.TYPE;

/**
 * Inject view state to {@link MvpPresenter#views} and
 * {@link MvpPresenter#viewState} presenter fields. Presenter, annotated with
 * this, should be strongly typed on view interface(not write some like extends
 * MvpPresenter&lt;V extends SuperView&gt;). Otherwise code generation make
 * code, that broke your app.
 */
@Target(value = TYPE)
public @interface InjectViewState {

    Class<? extends MvpViewState> value() default DefaultViewState.class;

    Class<? extends MvpView> view() default DefaultView.class;
}
