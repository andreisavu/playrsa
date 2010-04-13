package playrsa;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JDialog;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.ciscavate.cjwizard.WizardContainer;
import org.ciscavate.cjwizard.pagetemplates.TitledPageTemplate;

public class RSAWizard extends JDialog {

    private static Log log = LogFactory.getLog(RSAWizard.class);

    private final static int WIZARD_WIDTH = 750;
    private final static int WIZARD_HEIGHT = 530;

    public RSAWizard() {
        final WizardContainer container = 
            new WizardContainer(new RSAFactory(), new TitledPageTemplate());
        container.addWizardListener(new RSAWizardListener());

        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.getContentPane().add(container);
        this.pack();

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();

        int left = (int) (screenSize.getWidth() / 2 - WIZARD_WIDTH / 2);
        int top = (int) (screenSize.getHeight() / 2 - WIZARD_HEIGHT / 2);

//        this.setBounds(left, top, WIZARD_WIDTH, WIZARD_HEIGHT);
        this.setTitle("RSA Playground");
    }
}
