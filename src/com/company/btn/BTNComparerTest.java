package com.company.btn;

import org.junit.Assert;
import org.junit.Test;

public class BTNComparerTest {

    @Test
    public void  returns_true_for_same_trees (){
        BTN root = new BTN(new BTN( ),new BTN(), 1 );

        Assert.assertTrue( BTNComparer.areEqual(root, root ));
    }

    @Test
    public void  returns_true_for_equal_trees (){
        BTN tree1 = new BTN(new BTN( null, new BTN(), 2 ),new BTN(), 1 );
        BTN tree2 = new BTN(new BTN( null, new BTN(), 2 ),new BTN(), 1 );

        Assert.assertTrue( BTNComparer.areEqual(tree1, tree2 ));
    }


    @Test
    public void  returns_false_for_non_equal_values (){
        BTN tree1 = new BTN(new BTN( null, null, 2 ),new BTN(), 1 );
        BTN tree2 = new BTN(new BTN( null, null, 3 ),new BTN(), 1 );

        Assert.assertFalse( BTNComparer.areEqual(tree1, tree2 ));
    }

    @Test
    public void  returns_false_for_non_equal_structure (){
        BTN tree1 = new BTN(new BTN( null, new BTN(), 2 ),new BTN(), 1 );
        BTN tree2 = new BTN(new BTN( null, null, 2 ),new BTN(), 1 );

        Assert.assertFalse( BTNComparer.areEqual(tree1, tree2 ));
    }

    @Test
    public void  returns_true_for_empty_trees(){
        Assert.assertFalse( BTNComparer.areEqual(new BTN(), null ));
        Assert.assertTrue( BTNComparer.areEqual(null, null ));
        Assert.assertFalse( BTNComparer.areEqual(null,  new BTN() ));
    }
}
