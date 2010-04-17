
package playrsa;

import org.ciscavate.cjwizard.WizardSettings;

public abstract class RSAWizardPage extends org.ciscavate.cjwizard.WizardPage {

    public RSAWizardPage(String name, String description) {
        super(name, description);
    }

    abstract public void setup_page(WizardSettings settings);
}
