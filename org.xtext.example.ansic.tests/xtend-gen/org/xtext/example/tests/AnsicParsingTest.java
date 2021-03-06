/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.ansic.DomainModel;
import org.xtext.example.tests.AnsicInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(AnsicInjectorProvider.class)
@SuppressWarnings("all")
public class AnsicParsingTest {
  @Inject
  private ParseHelper<DomainModel> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello Xtext!");
      _builder.newLine();
      final DomainModel result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
