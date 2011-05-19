package net.nextquestion.pptx2html.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: rdclark
 * Date: 5/18/11
 * Time: 14:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class Slide {

    private List<String> strings = new ArrayList<String>();
    private List<String> titles = new ArrayList<String>();

    public Slide() {
    }

    public List<String> getStrings() {
        return strings;
    }

    public List<String> getTitles() {
        return titles;
    }

    public void add(String shapeType, List<String> paragraphs) {
        if (shapeType == null) shapeType = "";
        if (shapeType.endsWith("Title")) {
            for (String p: paragraphs) {
                if (p.length() > 0)
                    titles.add(p);
            }
        } else {
            strings.addAll(paragraphs);
        }
    }
}