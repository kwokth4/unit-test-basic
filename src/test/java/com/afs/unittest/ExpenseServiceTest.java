package com.afs.unittest;

import com.afs.unittest.Project.Project;
import com.afs.unittest.Project.ProjectType;
import com.afs.unittest.expense.ExpenseType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExpenseServiceTest {
    @Test
    void should_return_internal_expense_type_if_project_is_internal() {
        // given
        Project project = new Project(ProjectType.INTERNAL, "Internal Project");
        ExpenseService expenseService = new ExpenseService();

        // when
        ExpenseType expenseType = expenseService.getExpenseCodeByProjectTypeAndName(project);

        // then
        assertEquals(ExpenseType.INTERNAL_PROJECT_EXPENSE, expenseType);

    }

    @Test
    void should_return_expense_type_A_if_project_is_external_and_name_is_project_A() {
        // given

        // when

        // then

    }

    @Test
    void should_return_expense_type_B_if_project_is_external_and_name_is_project_B() {
        // given

        // when

        // then

    }

    @Test
    void should_return_other_expense_type_if_project_is_external_and_has_other_name() {
        // given

        // when

        // then

    }

    @Test
    void should_throw_unexpected_project_exception_if_project_is_invalid() {
        // given

        // when
        // then

    }
}