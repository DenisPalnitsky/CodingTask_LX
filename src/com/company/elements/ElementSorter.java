package com.company.elements;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ElementSorter {

    class ElementWithCustomComparer {
        Element element;

        public ElementWithCustomComparer (Element element){
            this.element = element;
        }

        @Override
        public int hashCode(){
            return Integer.hashCode(element.num);
        }

        @Override
        public boolean  equals(Object o) {
            return  element.num == ((ElementWithCustomComparer)o).element.num ;
        }
    }

    public Collection<Element> sortAndFilter(Collection<Element> collection){
        Collection<ElementWithCustomComparer> result = new HashSet<>();

        for (Element e : collection){
            if (e.age > 20 )
                result.add( new ElementWithCustomComparer(e));
        }

        return  result.stream().map(x-> x.element).collect(Collectors.toList());
    }
}
