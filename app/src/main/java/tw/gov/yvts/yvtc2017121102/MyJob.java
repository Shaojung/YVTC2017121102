package tw.gov.yvts.yvtc2017121102;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Log;

/**
 * Created by yvtc on 2017/12/11.
 */

public class MyJob extends JobService {
    @Override
    public boolean onStartJob(JobParameters params) {
        Log.d("JOB", "onStartJob");
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        Log.d("JOB", "onStopJob");
        return false;
    }
}
