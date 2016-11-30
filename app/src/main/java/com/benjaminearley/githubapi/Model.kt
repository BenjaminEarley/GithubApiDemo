package com.benjaminearley.githubapi

import com.jakewharton.rxrelay2.BehaviorRelay
import io.reactivex.disposables.Disposable

data class Model(
        val viewUpdates: BehaviorRelay<Unit>,
        var viewModel: ViewModel,
        var networkModel: Disposable?)
