package com.ravi.foodstar.data

import com.ravi.foodstar.data.network.RemoteDataSource
import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject
@ActivityRetainedScoped
class Repository @Inject constructor(
    remoteDataSource: RemoteDataSource
) {
    val remoteDataSource = remoteDataSource
}