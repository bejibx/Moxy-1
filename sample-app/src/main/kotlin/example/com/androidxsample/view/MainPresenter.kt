package example.com.androidxsample.view

import android.util.Log
import moxy.InjectViewState
import moxy.MvpPresenter

@InjectViewState
class MainPresenter constructor(
        private val logger: Logger
) : MvpPresenter<MainView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        logger.printErrorLog()
        Log.e(MainActivity.TAG, "presenter hash code : ${hashCode()}")
        viewState.printLog("TEST")
    }

    fun printLog() {
        viewState.printLog("TEST print log ${hashCode()}")
    }

}