package com.tenchy.enginelibrary.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/2/16.
 */

public class MyActivityUtils {

    private Context mContext;

    public MyActivityUtils(Context mContext) {
        this.mContext = mContext;
        listActivity = new ArrayList<>();

    }

    /**
     * 用于存放整个项目 的所有Activity对象
     */
    public ArrayList<Activity> listActivity;

    /**
     * 程序是否正在前台运行
     *
     * @return
     */
    @SuppressWarnings("deprecation")
    public boolean isTopActivitya() {
        /*
		 * System.out.println("**********************top packageName:" +
		 * getInstance().getPackageName());
		 */
        ActivityManager activityManager = (ActivityManager) mContext.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningTaskInfo> tasksInfo = activityManager.getRunningTasks(1);
        if (tasksInfo.size() > 0) {
			/*
			 * System.out.println("*********************curr packageName:" +
			 * tasksInfo.get(0).topActivity.getPackageName());
			 */
            // 应用程序位于堆栈的顶层
            if (mContext.getPackageName().equals(tasksInfo.get(0).topActivity.getPackageName())) {
                return true;
            }
        }
        return false;
    }

    /**
     * 添加到Activity容器中
     */
    public  void addActivity(Activity activity) {
        if (!listActivity.contains(activity)) {
            listActivity.add(activity);
        }
    }

    /**
     * 便利所有Activigty并finish
     */
    public  void finishActivity() {
        for (Activity activity : listActivity) {
            activity.finish();
        }
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
    }

    /**
     * 结束指定类名的Activity 在遍历一个列表的时候不能执行删除操作，所有我们先记住要删除的对象，遍历之后才去删除。
     */
    public  void finishSingleActivityByClass(Class cls) {
        Activity tempActivity = null;
        for (Activity activity : listActivity) {
            if (activity.getClass().equals(cls)) {
                tempActivity = activity;
            }
        }

        finishSingleActivity(tempActivity);
    }

    /**
     * 结束指定的Activity
     */
    public  void finishSingleActivity(Activity activity) {
        if (activity != null) {
            if (listActivity.contains(activity)) {
                listActivity.remove(activity);
            }
            activity.finish();
            activity = null;
        }
    }

}
