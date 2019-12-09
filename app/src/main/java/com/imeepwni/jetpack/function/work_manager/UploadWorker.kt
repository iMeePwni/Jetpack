package com.imeepwni.jetpack.function.work_manager

import android.content.Context
import androidx.work.*
import java.util.concurrent.TimeUnit

/**
 * 作者：Created by guofeng on 2019/12/2
 * 邮箱：feng.guo@bees360.com
 */

fun main(context: Context) {
    val workManager = WorkManager.getInstance(context)
    workManager.getWorkInfosByTagLiveData("")
    workManager.enqueue(simpleRequest())
}

fun simpleRequest(): WorkRequest {
    val data = workDataOf("key" to "")
    val constraints = Constraints.Builder()
        .setRequiresDeviceIdle(true)
        .build()
    return OneTimeWorkRequestBuilder<UploadWorker>()
        .setInputData(data)
        .setConstraints(constraints)
        .setInitialDelay(1, TimeUnit.SECONDS)
        .setBackoffCriteria(
            BackoffPolicy.LINEAR,
            OneTimeWorkRequest.MIN_BACKOFF_MILLIS,
            TimeUnit.MILLISECONDS
        )
        .build()
}

class UploadWorker(context: Context, workerParameters: WorkerParameters) :
    Worker(context, workerParameters) {

    override fun doWork(): Result {
        // Do the work here--in this case, upload the images.
        val string = inputData.getString("key")
        uploadImages()

        // Indicate whether the task finished successfully with the Result
        return Result.success()
    }

    private fun uploadImages() {

    }
}