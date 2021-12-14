/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.test.http.functional;

import static java.util.Collections.emptyList;
import static org.mule.runtime.http.policy.api.SourcePolicyAwareAttributes.noAttributes;

import org.mule.runtime.core.api.policy.Policy;
import org.mule.runtime.core.api.policy.PolicyProvider;
import org.mule.runtime.policy.api.PolicyAwareAttributes;
import org.mule.runtime.policy.api.PolicyPointcutParameters;

import java.util.List;

public class NullPolicyProvider implements PolicyProvider {

  private PolicyAwareAttributes sourcePolicyAwareAttributes = noAttributes();;

  @Override
  public List<Policy> findSourceParameterizedPolicies(PolicyPointcutParameters policyPointcutParameters) {
    return emptyList();
  }

  @Override
  public PolicyAwareAttributes sourcePolicyAwareAttributes() {
    return sourcePolicyAwareAttributes;
  }

  @Override
  public List<Policy> findOperationParameterizedPolicies(PolicyPointcutParameters policyPointcutParameters) {
    return emptyList();
  }

  @Override
  public boolean isSourcePoliciesAvailable() {
    return false;
  }

  @Override
  public boolean isOperationPoliciesAvailable() {
    return false;
  }
}
