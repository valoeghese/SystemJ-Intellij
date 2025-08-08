package nz.valoeghese.systemjintellij;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class SystemJFileType extends LanguageFileType {
    private SystemJFileType() {
        super(SystemJLanguage.INSTANCE);
    }

    @Override
    public @NotNull String getName() {
        return "SystemJ Source File";
    }

    @Override
    public @NotNull String getDescription() {
        return "Source for a SystemJ program";
    }

    @Override
    public @NotNull String getDefaultExtension() {
        return "sysj";
    }

    @Override
    public Icon getIcon() {
        return SJIcons.FILE;
    }

    public static final SystemJFileType INSTANCE = new SystemJFileType();
}
