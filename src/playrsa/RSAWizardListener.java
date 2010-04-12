
package playrsa;

import java.util.List;
import org.ciscavate.cjwizard.WizardListener;
import org.ciscavate.cjwizard.WizardPage;
import org.ciscavate.cjwizard.WizardSettings;

class RSAWizardListener implements WizardListener {

    public void onPageChanged(WizardPage newPage, List<WizardPage> path) {
    }

    public void onFinished(List<WizardPage> path, WizardSettings settings) {
        System.exit(0);
    }

    public void onCanceled(List<WizardPage> path, WizardSettings settings) {
        System.exit(0);
    }

}
