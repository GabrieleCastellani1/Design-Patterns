package it.euris.academy.creazionali.factory.refactoringGuruExample.factory;

import it.euris.academy.creazionali.factory.refactoringGuruExample.buttons.Button;
import it.euris.academy.creazionali.factory.refactoringGuruExample.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
