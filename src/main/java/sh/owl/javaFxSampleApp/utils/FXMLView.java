package sh.owl.javaFxSampleApp.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;

import java.io.IOException;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public interface FXMLView<T extends Node> {
    default String getAssetName() {
        return this.getClass().getSimpleName().trim();
    }

    default String getFxmlName() {
        return getAssetName() + ".fxml";
    }

    default String getResourcesName() {
        return getAssetName() + ".properties";
    }

    default ResourceBundle getResourceBundle() {
        ResourceBundle bundle = null;
        try {
            bundle = ResourceBundle.getBundle(getResourcesName());
        }
        catch (MissingResourceException e) {
            try {
                bundle = ResourceBundle.getBundle(getResourcesName(), Locale.ENGLISH);
            }
            catch (MissingResourceException ignored) {}
        }
        return bundle;
    }

    @SuppressWarnings("unchecked")
    default T load(boolean setRoot) {
        try {
            var resourceBundle = getResourceBundle();
            var fxmlResource = getClass().getResource(getFxmlName());

            FXMLLoader loader;
            loader = resourceBundle == null ? new FXMLLoader(fxmlResource) : new FXMLLoader(fxmlResource, resourceBundle);
            if (setRoot)
                loader.setRoot(this);
            return (T) loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
