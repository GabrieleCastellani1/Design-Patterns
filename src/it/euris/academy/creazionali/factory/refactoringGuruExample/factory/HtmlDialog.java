package it.euris.academy.creazionali.factory.refactoringGuruExample.factory;

import it.euris.academy.creazionali.factory.refactoringGuruExample.buttons.Button;
import it.euris.academy.creazionali.factory.refactoringGuruExample.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
