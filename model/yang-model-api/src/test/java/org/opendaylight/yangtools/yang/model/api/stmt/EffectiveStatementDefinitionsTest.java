/*
 * Copyright (c) 2026 PANTHEON.tech, s.r.o. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.yangtools.yang.model.api.stmt;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.mockito.Mockito.mock;

import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Answers;
import org.opendaylight.yangtools.yang.model.api.meta.StatementDefinition;

class EffectiveStatementDefinitionsTest {
    @ParameterizedTest
    @MethodSource
    void definitionsMatch(final StatementDefinition<?, ?, ?> def) {
        final var obj = mock(def.effectiveRepresentation(), Answers.CALLS_REAL_METHODS);
        assertNotNull(obj);
        assertSame(def, obj.statementDefinition());
    }

    private static List<Arguments> definitionsMatch() {
        return List.of(
            arguments(ActionStatement.DEF),
            arguments(AnydataStatement.DEF),
            arguments(AnyxmlStatement.DEF),
            arguments(ArgumentStatement.DEF),
            arguments(AugmentStatement.DEF),
            arguments(BaseStatement.DEF),
            arguments(BelongsToStatement.DEF),
            arguments(BitStatement.DEF),
            arguments(CaseStatement.DEF),
            arguments(ChoiceStatement.DEF),
            arguments(ConfigStatement.DEF),
            arguments(ContactStatement.DEF),
            arguments(ContainerStatement.DEF),
            arguments(DefaultStatement.DEF),
            arguments(DescriptionStatement.DEF),
            arguments(DeviateStatement.DEF),
            arguments(DeviationStatement.DEF),
            arguments(EnumStatement.DEF),
            arguments(ErrorAppTagStatement.DEF),
            arguments(ErrorMessageStatement.DEF),
            arguments(ExtensionStatement.DEF),
            arguments(FeatureStatement.DEF),
            arguments(FractionDigitsStatement.DEF),
            arguments(GroupingStatement.DEF),
            arguments(IdentityStatement.DEF),
            arguments(IfFeatureStatement.DEF),
            arguments(ImportStatement.DEF),
            arguments(IncludeStatement.DEF),
            arguments(InputStatement.DEF),
            arguments(KeyStatement.DEF),
            arguments(LeafListStatement.DEF),
            arguments(LeafStatement.DEF),
            arguments(LengthStatement.DEF),
            arguments(ListStatement.DEF),
            arguments(MandatoryStatement.DEF),
            arguments(MaxElementsStatement.DEF),
            arguments(MinElementsStatement.DEF),
            arguments(ModifierStatement.DEF),
            arguments(ModuleStatement.DEF),
            arguments(MustStatement.DEF),
            arguments(NamespaceStatement.DEF),
            arguments(NotificationStatement.DEF),
            arguments(OrderedByStatement.DEF),
            arguments(OrganizationStatement.DEF),
            arguments(OutputStatement.DEF),
            arguments(PathStatement.DEF),
            arguments(PatternStatement.DEF),
            arguments(PositionStatement.DEF),
            arguments(PrefixStatement.DEF),
            arguments(PresenceStatement.DEF),
            arguments(RangeStatement.DEF),
            arguments(ReferenceStatement.DEF),
            arguments(RefineStatement.DEF),
            arguments(RequireInstanceStatement.DEF),
            arguments(RevisionStatement.DEF),
            arguments(RpcStatement.DEF),
            arguments(StatusStatement.DEF),
            arguments(SubmoduleStatement.DEF),
            arguments(TypedefStatement.DEF),
            arguments(TypeStatement.DEF),
            arguments(UniqueStatement.DEF),
            arguments(UnitsStatement.DEF),
            arguments(UsesStatement.DEF),
            arguments(ValueStatement.DEF),
            arguments(WhenStatement.DEF),
            arguments(YinElementStatement.DEF));
    }
}
