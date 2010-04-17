
package playrsa;

import java.util.List;
import org.ciscavate.cjwizard.PageFactory;
import org.ciscavate.cjwizard.WizardPage;
import org.ciscavate.cjwizard.WizardSettings;
import playrsa.pages.DecryptedMessagePage;
import playrsa.pages.EncryptedMessagePage;
import playrsa.pages.GetMessagePage;
import playrsa.pages.KeyPairPage;
import playrsa.pages.Step1;
import playrsa.pages.Step2;
import playrsa.pages.Step3;
import playrsa.pages.Step4;
import playrsa.pages.WelcomePage;

class RSAFactory implements PageFactory {

    private final RSAWizardPage[] pages = {
        new WelcomePage(),
        new Step1(),
        new Step2(),
        new Step3(),
        new Step4(),
        new KeyPairPage(),
        new GetMessagePage(),
        new EncryptedMessagePage(),
        new DecryptedMessagePage()
    };

    public WizardPage createPage(List<WizardPage> path, WizardSettings settings) {
        RSAWizardPage page = pages[path.size()];
        page.setup_page(settings);
        return page;
    }

}
