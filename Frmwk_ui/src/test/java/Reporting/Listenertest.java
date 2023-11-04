package Reporting;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenertest implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println(result.getName() + " Execution is started");//print method name
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println(result.getName() + " Execution is completed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println(result.getName() + " Execution is failed");
    }
}
