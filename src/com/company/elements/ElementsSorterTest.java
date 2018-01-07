package com.company.elements;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class ElementsSorterTest {

    @Test
    public void sort_filters_out_age_greater_then_20(){

        Collection<Element> elements = new ArrayList<Element>();
        elements.add(new Element(0,"a", 21));
        elements.add(new Element(0,"b", 20));
        ElementSorter sorter = new ElementSorter();
        Collection<Element> result = sorter.sortAndFilter(elements);

        for (Element e : result)
            Assert.assertTrue( e.age > 20  );
    }

    @Test
    public void sort_filters_out_unique_num_values(){

        Collection<Element> elements = new ArrayList<Element>();
        elements.add(new Element(5,"a", 25));
        elements.add(new Element(5,"b", 25));
        ElementSorter sorter = new ElementSorter();
        Collection<Element> result = sorter.sortAndFilter(elements);

        Assert.assertTrue( result.size() == 1  );
    }
}
