package com.jetbrains.rest;

import com.intellij.lang.Language;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.LanguageSubstitutor;
import org.jetbrains.annotations.NotNull;

/**
 * User : catherine
 */
public class RestLanguageSubstitutor extends LanguageSubstitutor {
  @Override
  public Language getLanguage(@NotNull final VirtualFile vFile, @NotNull final Project project) {
     boolean txtIsRst = ReSTService.getInstance(project).txtIsRst();
     if (txtIsRst)
       return RestLanguage.INSTANCE;
     return null;
  }
}
