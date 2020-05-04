package builder;

import model.Arquivo;

public class EditorFabrica {

    private final EditorBuilder editorBuilder;

    public EditorFabrica(EditorBuilder editorBuilder) {
        this.editorBuilder = editorBuilder;
    }

    public void construirEditor(Arquivo arquivo) {
        this.editorBuilder.construirEditor(arquivo);
    }

}
