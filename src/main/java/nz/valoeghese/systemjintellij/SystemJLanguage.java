package nz.valoeghese.systemjintellij;

import com.intellij.lang.Language;

public class SystemJLanguage extends Language {
    private SystemJLanguage() {
        super("SystemJ");
    }

    public static final SystemJLanguage INSTANCE = new SystemJLanguage();
}
