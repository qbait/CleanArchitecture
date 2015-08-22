package mockimpl;

import io.patrykpoborca.cleanarchitecture.ui.MVPCI.interfaces.MainActivityMVPCIPview;
import io.patrykpoborca.cleanarchitecture.ui.MVPCI.models.UserProfile;

public class MockMVPCIPview implements MainActivityMVPCIPview {

    public UserProfile loggedInProfile;
    public boolean loggedOutCalled = false;
    public boolean toggleProgresbarCalled = false;

    @Override
    public void loggedIn(UserProfile profile) {
        this.loggedInProfile = profile;
    }

    @Override
    public void loggedOut() {
        loggedOutCalled = true;
    }

    @Override
    public void toggleProgressBar(boolean loading) {
        toggleProgresbarCalled = true;
    }

    @Override
    public void displayToast(String toast) {

    }
}